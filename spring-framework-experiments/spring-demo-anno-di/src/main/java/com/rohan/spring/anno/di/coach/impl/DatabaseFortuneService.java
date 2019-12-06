package com.rohan.spring.anno.di.coach.impl;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Random;

import org.springframework.stereotype.Component;

import com.rohan.spring.anno.di.coach.FortuneService;

@Component
public class DatabaseFortuneService implements FortuneService {

    private static final String FORTUNE_FILE_NAME = "/fortunes.txt";
    private ArrayList<String> fortunesList = new ArrayList<>();;
    private Random randomGenerator = new Random();
    private int length;

    public DatabaseFortuneService() {
        length = this.readFile();
    }

    private int readFile() {
        FileReader fr = null;
        BufferedReader br = null;
        try {

            fr = new FileReader(getFilePath());
            br = new BufferedReader(fr);

            String line = null;
            while ((line = br.readLine()) != null) {
                fortunesList.add(line);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if (br != null) {
                    br.close();
                }

                if (fr != null) {
                    fr.close();
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }

        return fortunesList.size();
    }

    // FIXME: Handle error scenarios
    private String getFilePath() {
        URL url = this.getClass().getResource(FORTUNE_FILE_NAME);
        if (url != null){
            return url.getPath();
        }
        else {
            return "nothing";
        }
    }
    
    @Override
    public String getFortune() {
        return fortunesList.get(randomGenerator.nextInt(length));
    }
}

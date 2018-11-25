package ru.kpfu.itis.textsimilarity;

import java.util.ArrayList;
import java.util.List;

public class JaccardTextAnalyzer extends AbstractTextAnalyzer {
    @Override
    public double analyze(TextProvider te1, TextProvider te2) {
        List<String> list1 = tokenizeUnique(te1.getText());
        List<String> list2 = tokenizeUnique(te2.getText());
        return jaccardSimilarity(list1, list2);
    }


    private double jaccardSimilarity(List<String> l1, List<String> l2) {
        int commonWordsCount = 0;
        for (String word : l1) {
            if (l2.contains(word)) {
                commonWordsCount++;
            }
        }
        return (double) commonWordsCount / (l1.size() + l2.size() - commonWordsCount);
    }
}















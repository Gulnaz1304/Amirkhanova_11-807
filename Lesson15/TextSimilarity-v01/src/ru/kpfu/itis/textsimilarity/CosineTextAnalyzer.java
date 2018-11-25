package ru.kpfu.itis.textsimilarity;

import java.util.ArrayList;
import java.util.List;

public class CosineTextAnalyzer extends AbstractTextAnalyzer {
    @Override
    public double analyze(TextProvider te1, TextProvider te2) {
        List<String> allwords = tokenizeUnique(te1.getText() + " " + te2.getText());
        List<String> list1 = tokenizeUnique(te1.getText());
        List<String> list2 = tokenizeUnique(te2.getText());
        return cosineSimilarity(list1,list2,allwords);
}

    private List<String> tokenize(String text) {
        text = text.replace(",", "");
        String[] words = text.split(" ");
        List<String> listWords = new ArrayList<>();
        for (String word : words) {
            word = word.toLowerCase();
            listWords.add(word);
        }
        return listWords;
    }
    private double[] termFrequency(List<String> list, List<String> allwords) {
        double[] count = new double[allwords.size()];
        for (String word : list) {
            if (allwords.contains(word)) {
                count[allwords.indexOf(word)]++;
            }
        }
        double len = 0;
        for (double i : count) {
            len += i * i;
        }
        len = Math.sqrt(len);
        for (int i = 0; i < count.length; i++) {
            count[i] = count[i] / len;
        }
        return count;
    }
    private double cosineSimilarity(List<String> l1, List<String> l2, List<String> allwords) {
        double[] c1 = termFrequency(l1, allwords);
        double[] c2 = termFrequency(l2, allwords);
        double similatiry = 0;
        for (int i = 0; i < c1.length; i++) {
            similatiry += c1[i] * c2[i];
        }
        return similatiry;
    }
}
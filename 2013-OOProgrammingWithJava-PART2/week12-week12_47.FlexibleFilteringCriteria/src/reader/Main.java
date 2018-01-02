package reader;

import reader.criteria.Criterion;
import reader.criteria.ContainsWord;
import reader.criteria.EndsWithQuestionOrExclamationMark;

public class Main {

    public static void main(String[] args) {
        Criterion c = new EndsWithQuestionOrExclamationMark();
        System.out.println(c.complies("fucker?"));
    }
}

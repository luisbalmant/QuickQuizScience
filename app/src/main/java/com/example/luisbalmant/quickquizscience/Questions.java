package com.example.luisbalmant.quickquizscience;

/**
 * Created by LuisBalmant on 18/07/2017.
 */

public class Questions {

    public String mQuestions[] = {

            // Question 01
            "What is the function of insulin?",

            // Question 02
            "Why is the pancreas considered a mixed gland?",

            // Question 03
            "In women, which hormone stimulates ovulation?",

            // Question 04
            "What part of the human body controls the pituitary gland?",

            // Question 05
            "Between the endocrine glands, which produce adrenaline?",

            // Question 06
            "Ovaries secrete sex hormones _______: Estrogen and _______.",
    };

    private String mChoices[][] = {
            // Choices question 1
            {
                    "Controlling the blood glucose content",
                    "Stimulate increased blood glucose concentration",
                    "Extract the glucose from the blood"
            },

            // Choices question 2
            {
                    "Because it is located in the abdomen region",
                    "Because it has an endocrine function, to produce hormone, and also exocrine",
                    "Because it can switch function with the adrenal glands"
            },

            // Choices question 3
            {
                    "The follicle stimulant (FSH)",
                    "Adrenocorticotrophic (ADSH)",
                    "The luteinizing agent (LH)"
            },

            // Choices question 4
            {
                    "The endometrium, in the womb",
                    "The neocortex, in the liver",
                    "The hypothalamus in the brain"
            },

            // Choices question 5
            {
                    "The thyroid",
                    "The renal adrenals",
                    "The Parathyroid"
            },

            // Choices question 6
            {
                    "Women; Progesterone",
                    "Women; Testosterone",
                    "Men; adrenaline"
            },


    };

    private String mCorrectAnswers[] = {
            "Controlling the blood glucose content",
            "Because it has an endocrine function, to produce hormone, and also exocrine",
            "The luteinizing agent (LH)",
            "The hypothalamus in the brain",
            "The renal adrenals",
            "Women; Progesterone",
    };

    public String getQuestion(int a) {
        String question = mQuestions[a];
        return question;
    }

    public String getChoice1(int a) {
        String choice = mChoices[a][0];
        return choice;
    }

    public String getChoice2(int a) {
        String choice = mChoices[a][1];
        return choice;
    }

    public String getChoice3(int a) {
        String choice = mChoices[a][2];
        return choice;
    }

    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }
}

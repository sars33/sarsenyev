package ru.job4j.condition;

/**
 * @author Sergey Arsenyev (sarsenyev@hotmail.com)
 * @version $Id$
 * @since 0.1
 */

public class DummyBot {
    /**
     * Answers simple questions
     * @param question Question from a client.
     * @return Answer
     */
    public String answer(String question) {
        String rsl = "This is confusing me, Please ask a different question. ";
        if ("Hello, Bot.".equals(question)) {
            rsl = "Hi, smart pans.";
        } else if ("Bye.".equals((question))) {
            rsl = "See you later alligator.";
        }
        return rsl;

    }
}


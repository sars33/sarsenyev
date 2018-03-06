package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Sergey Arsenyev (sarsenyev@hotmail.com)
 * @version $Id$
 * @since 0.1
 */
public class DummyBotTest {
    @Test
    public void whenGreetBot() {
        DummyBot bot = new DummyBot();
        assertThat(
                bot.answer("Hello, Bot."),
                is("Hi, smart pans.")
        );
    }

    @Test
    public void whenByuBot() {
        DummyBot bot = new DummyBot();
        assertThat(
                bot.answer("Bye."),
                is("See you later alligator.")
        );
    }

    @Test
    public void whenUnknownBot() {
        DummyBot bot = new DummyBot();
        assertThat(
                bot.answer("Сколько будет 2 + 2?"),
                is("This is confusing me, Please ask a different question. ")
        );
    }
}
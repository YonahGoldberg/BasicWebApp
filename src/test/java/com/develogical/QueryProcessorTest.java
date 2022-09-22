package com.develogical;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class QueryProcessorTest {

    QueryProcessor queryProcessor = new QueryProcessor();

    @Test
    public void returnsEmptyStringIfCannotProcessQuery() throws Exception {
        assertThat(queryProcessor.process("test"), is(""));
    }

    @Test
    public void knowsAboutShakespeare() throws Exception {
        assertThat(queryProcessor.process("Shakespeare"), containsString("playwright"));
    }

    @Test
    public void isNotCaseSensitive() throws Exception {
        assertThat(queryProcessor.process("shakespeare"), containsString("playwright"));
    }

    @Test
    public void knowsAboutGuay() throws Exception {
        assertThat(queryProcessor.process("guay"), containsString("guay"));
    }

    @Test
    public void add() throws Exception {
        assertThat(queryProcessor.process("largest 2 3"), containsString("3"));
    }

    public void squareAndCube() throws Exception {
        assertThat(queryProcessor.process("which of the following is a square and a cube 64 8"), containsString("64"));
    }

    public void mult() throws Exception {
        assertThat(queryProcessor.process("multiplied 5 3"), containsString("15"));
    }
}

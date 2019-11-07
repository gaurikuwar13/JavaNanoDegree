package com.howtoprogram.unit5;

import com.howtoprogram.VowelOnly;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.assertj.core.api.Assertions.assertThat;

public class VowelOnlyTest {

    protected Logger logger = LoggerFactory.getLogger(this.getClass().getName());

    @Test
    public void vowelOnly() {
        VowelOnly vowelCount = new VowelOnly();
        assertThat(vowelCount.vowelcount("Udacity Course!")).isEqualTo("Uaioue");
    }
}

package com.howtoprogram.unit5;

import com.howtoprogram.StringReverse;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertThat;

public class StringReverseTest extends StringReverse {
    @Test
    public void reverseStringTest() {
        Assertions.assertThat(reverseString("abcd")).isEqualTo("dcba");
        Assertions.assertThat(reverseString("Hello World!")).isEqualTo("!dlroW olleH");
    }
}

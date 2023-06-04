package com.kata.kataforfun;

import com.kata.kataforfun.services.KataForFunService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class KataForFunApplicationTests {

    @Test
    void Should_return_1_if_number_is_1() {
        Assertions.assertThat(new KataForFunService().convertNumber(1)).isEqualTo("1");
    }

    @Test
    void Should_return_2_if_number_is_2(){
        Assertions.assertThat(new KataForFunService().convertNumber(2)).isEqualTo("2");
    }

}



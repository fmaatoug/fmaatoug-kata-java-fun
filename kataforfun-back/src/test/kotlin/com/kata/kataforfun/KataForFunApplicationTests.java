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

    @Test
    void Should_return_KataKata_if_number_is_3(){
        Assertions.assertThat(new KataForFunService().convertNumber(3)).isEqualTo("KataKata");
    }

    @Test
    void Should_return_ForFor_if_number_is_5(){
        Assertions.assertThat(new KataForFunService().convertNumber(5)).isEqualTo("ForFor");
    }

    @Test
    void Should_return_Fun_if_number_is_7(){
        Assertions.assertThat(new KataForFunService().convertNumber(7)).isEqualTo("Fun");
    }

    @Test
    void Should_return_Kata_if_number_is_9(){
        Assertions.assertThat(new KataForFunService().convertNumber(9)).isEqualTo("Kata");
    }

}



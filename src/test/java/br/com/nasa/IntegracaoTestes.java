package br.com.nasa;


import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class IntegracaoTestes extends ControleRobosApplicationTests {

    @Autowired
    private MockMvc mvc;

    @Test
    public void comandoOkTest() throws Exception {
        this.mvc.perform(post("/rest/mars/MMRMMRMM").accept(MediaType.TEXT_PLAIN))
                .andExpect(status().isOk())
                .andExpect(content().string("(2, 0, S)"));
    }

    @Test
    public void commandoAndarRotacionar() throws Exception {
        this.mvc.perform(post("/rest/mars/MML").accept(MediaType.TEXT_PLAIN))
                .andExpect(status().isOk())
                .andExpect(content().string("(0, 2, W)"));
    }

    @Test
    public void comandoInvalido2() throws Exception {
        this.mvc.perform(post("/rest/mars/AAA").accept(MediaType.TEXT_PLAIN))
                .andExpect(status().isBadRequest());
    }

    @Test
    public void comandoForaDoPerimetroX() throws Exception {
        this.mvc.perform(post("/rest/mars/MMMMMMMMMMMMMMMMMMMMMMMM").accept(MediaType.TEXT_PLAIN))
                .andExpect(status().isBadRequest());
    }

    @Test
    public void comandoForaDoPerimetroY() throws Exception {
        this.mvc.perform(post("/rest/mars/LM").accept(MediaType.TEXT_PLAIN))
                .andExpect(status().isBadRequest());
    }

    @Test
    public void comandoInvalido1() throws Exception {
        this.mvc.perform(post("/rest/mars/ALM").accept(MediaType.TEXT_PLAIN))
                .andExpect(status().isBadRequest());
    }
}

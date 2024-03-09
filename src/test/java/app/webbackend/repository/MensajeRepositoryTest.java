package app.webbackend.repository;

import app.webbackend.models.Mensaje;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@AutoConfigureMockMvc
public class MensajeRepositoryTest {
    MensajeRepository mensajeRepository;

    @Autowired
    private MensajeRepositoryTest(MensajeRepository mensajeRepository){this.mensajeRepository = mensajeRepository;};

    @Test
    void addNewMessage(){
        //Given
        Mensaje mensaje = new Mensaje();
        mensaje.setContenido("Hola Mundo!");

        //When
        Mensaje mensajeGuardado = mensajeRepository.save(mensaje);

        //Then
        assertNotNull(mensajeGuardado.getId(),"El mensaje tiene ID");
    }
}

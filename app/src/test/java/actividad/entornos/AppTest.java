/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package actividad.entornos;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }
    @Test
    void appSumaCorrecta(){
        App classUnderTest=new App();
        assertEquals(3,classUnderTest.sumar(1, 2));
    }
}

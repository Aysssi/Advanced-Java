package p06_TirePressureMonitoringSystem;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class AlarmTest {

    private static final Sensor sensor = Mockito.mock(Sensor.class);

    @Test
    public void TestCheckWithLowerPressureHold(){

    Mockito.when(sensor.popNextPressurePsiValue())
            .thenReturn(15.0);

    Alarm alarm = new Alarm(sensor);

    alarm.check();

    assertTrue(alarm.getAlarmOn());

   }

   @Test
    public void TestCheckWithHigherPressurePsiValue(){

        Mockito.when(sensor.popNextPressurePsiValue())
                .thenReturn(22.0);

        Alarm alarm = new Alarm(sensor);
        alarm.check();

        assertTrue(alarm.getAlarmOn());
   }
    @Test
    public void TestCheckReturnFalse(){

        Mockito.when(sensor.popNextPressurePsiValue())
                .thenReturn(18.0);

        Alarm alarm = new Alarm(sensor);
        alarm.check();

        assertFalse(alarm.getAlarmOn());
    }
}
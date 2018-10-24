import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestSample2{
    @Test
        public void testHowManyDays() throws Exception {
        assertEquals(29, Sample2.howManyDays(2,1996));
        assertEquals(28, Sample2.howManyDays(2,2001));
        assertEquals(29, Sample2.howManyDays(2,2000));
        assertEquals(0, Sample2.howManyDays(13,1996)); }
}


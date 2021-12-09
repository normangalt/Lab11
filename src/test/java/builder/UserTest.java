package builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    @org.junit.jupiter.api.Test
    void testToString() {
        User user = User.builder().firstName("N").lastName("G").age(1).weight(20).height(20).gender(true).build();
        assertEquals(user.toString(), "User(firstName=N, lastName=G, occupations=[], age=1, weight=20.0, height=20.0, gender=true)");
    }
}
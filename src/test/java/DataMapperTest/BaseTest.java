package DataMapperTest;

import Infrastructure.data.UserDataMapper;
import Infrastructure.data.UserFileDataMapper;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

public class BaseTest {
    protected UserFileDataMapper mapper;
    @Rule
    public ExpectedException ex = ExpectedException.none();

}

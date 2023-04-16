package farrel.com.unittest.repository;

import farrel.com.unittest.data.Person;

public interface PersonRepository {

    Person selectById(String id);
}

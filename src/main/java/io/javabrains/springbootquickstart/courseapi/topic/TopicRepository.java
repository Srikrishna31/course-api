package io.javabrains.springbootquickstart.courseapi.topic;

import org.springframework.context.annotation.Primary;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Primary
public interface TopicRepository extends CrudRepository<Topic, String>{

    // getAllTopics()
    // getTopic(String id)
    // updateTopic(Topic t)
    // deleteTopic(String id)
}

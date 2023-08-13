package io.javabrains.springbootquickstart.courseapi.topic;

import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;



    EntityManagerFactory emf;
    private List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("spring", "Spring Framework", "Spring Framework Description"),
            new Topic("java", "Core Java", "Core Java Description"),
            new Topic("javascript", "JavaScript", "JavaScript Description")
        ));

    List<Topic> getAllTopics() {
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll().forEach(topics::add);
        return topics;
    }

    Topic getTopic(String id) {
        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    void addTopic(Topic topic) {
        topicRepository.save(topic);
    }

    void updateTopic(Topic topic, String id) {
        topicRepository
                .findById(id).map(t -> topic)
                .ifPresent(value -> topicRepository.save(value));
//        for (int i = 0; i < topics.size(); i++) {
//            if (topic.getId().equals(id)) {
//                topics.set(i, topic);
//                return;
//            }
//        }
    }

    void deleteTopic(String id) {
        topicRepository.deleteAllById(Collections.singletonList(id));
    }
}

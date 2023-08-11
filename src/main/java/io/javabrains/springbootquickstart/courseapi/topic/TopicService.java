package io.javabrains.springbootquickstart.courseapi.topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic("spring", "Spring Framework", "Spring Framework Description"),
            new Topic("java", "Core Java", "Core Java Description"),
            new Topic("javascript", "JavaScript", "JavaScript Description")
        ));

    List<Topic> getAllTopics() {
        return topics;
    }

    Topic getTopic(String id) {
        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    void addTopic(Topic topic) {
        topics.add(topic);
    }

    void updateTopic(Topic topic, String id) {
        for (int i = 0; i < topics.size(); i++) {
            if (topic.getId().equals(id)) {
                topics.set(i, topic);
                return;
            }
        }
    }

    void deleteTopic(String id) {
        topics.removeIf(t -> t.getId().equals(id));
    }
}

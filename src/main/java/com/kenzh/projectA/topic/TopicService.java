package com.kenzh.projectA.topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by kenzh on 4/1/17.
 */
@Service
public class TopicService {

    private List<Topic> topics = new ArrayList<>(
            Arrays.asList(new Topic("spring", "Spring Framework", "Spring description"),
                        new Topic("java", "java Framework", "java description"),
                        new Topic("javascript", "javascript Framework", "javascript description"))
            );

    public Topic getTopic(String id) {
        return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
    }

    public List<Topic> getTopics() {
        return topics;
    }

    public void setTopics(List<Topic> topics) {
        this.topics = topics;
    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }

    public void updateTopic(Topic topic) {
        Topic temp = getTopic(topic.getId());
        temp.setName(topic.getName());
        temp.setDescription(topic.getDescription());
    }

    public void deleteTopic(String id) {
        topics.removeIf(t -> t.getId().equals(id));
    }
}

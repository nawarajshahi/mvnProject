package learnMaven.mvnProject.repository;

import org.springframework.data.repository.CrudRepository;

import learnMaven.mvnProject.entity.Friend;

public interface FriendRepository extends CrudRepository<Friend, Long> {

}

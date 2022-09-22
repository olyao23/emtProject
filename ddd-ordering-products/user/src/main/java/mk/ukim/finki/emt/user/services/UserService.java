package mk.ukim.finki.emt.user.services;

import lombok.AllArgsConstructor;
import mk.ukim.finki.emt.user.domain.exceptions.UserNotFoundException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

import mk.ukim.finki.emt.user.domain.models.User;
import mk.ukim.finki.emt.user.domain.models.UserId;


public interface UserService {

    List<User> findAll();

    Optional<User> findById(UserId userId);

    void addUser(UserId userId) throws UserNotFoundException;

    void deleteUser(UserId userId) throws UserNotFoundException;
}

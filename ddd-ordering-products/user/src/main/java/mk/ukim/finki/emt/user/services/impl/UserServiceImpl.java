package mk.ukim.finki.emt.user.services.impl;

import lombok.AllArgsConstructor;
import mk.ukim.finki.emt.user.domain.exceptions.UserNotFoundException;
import mk.ukim.finki.emt.user.domain.models.User;
import mk.ukim.finki.emt.user.domain.models.UserId;
import mk.ukim.finki.emt.user.domain.repository.UserRepository;
import mk.ukim.finki.emt.user.services.UserService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
@AllArgsConstructor
public class UserServiceImpl implements UserService {


    private final UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return this.userRepository.findAll();
    }

    @Override
    public Optional<User> findById(UserId userId) {
        return this.userRepository.findById(userId);
    }

    @Override
    public void addUser(UserId userId) throws UserNotFoundException {
        User user = this.userRepository.findById(userId).orElseThrow(UserNotFoundException::new);
//treba create
        this.userRepository.save(user);
    }

    @Override
    public void deleteUser(UserId userId) throws UserNotFoundException {
        User user = this.userRepository.findById(userId).orElseThrow(UserNotFoundException::new);
        this.userRepository.delete(user);
        this.userRepository.save(user);
    }
}

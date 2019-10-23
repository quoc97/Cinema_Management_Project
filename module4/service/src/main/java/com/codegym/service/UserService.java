package com.codegym.service;
        import com.codegym.dao.dto.UserDTO;
        import com.codegym.dao.entity.User;
        import java.util.List;
public interface UserService {
    List<User> findAll();
    //    List<User> findAllByDeletedIsFalse();
    UserDTO findByIdUser(Long idUser);
    void updatePassword(UserDTO userDTO);
    void updateUser(UserDTO userDTO);
    void save(UserDTO userDTO);
}
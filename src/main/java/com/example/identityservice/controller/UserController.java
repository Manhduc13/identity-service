package com.example.identityservice.controller;

import com.example.identityservice.dto.response.ApiResponse;
import com.example.identityservice.dto.request.UserCreationRequest;
import com.example.identityservice.dto.request.UserUpdateRequest;
import com.example.identityservice.dto.response.UserResponse;
import com.example.identityservice.entity.User;
import com.example.identityservice.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
// @RequestMapping("/users)
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/users")
    public ApiResponse<UserResponse> createUser(@RequestBody @Valid UserCreationRequest request){
        ApiResponse<UserResponse> apiResponse = new ApiResponse<>();
        apiResponse.setMessage("Succeeded");
        apiResponse.setResult(userService.createUser(request));
        return apiResponse;
    }
    @GetMapping("/users")
    public List<User> getUsers(){
        return userService.getUsers();
    }

    @GetMapping("/users/{userId}")
    public ApiResponse<UserResponse> getUserById(@PathVariable("userId") String userId){
        ApiResponse<UserResponse> apiResponse = new ApiResponse<>();
        apiResponse.setMessage("Succeeded");
        apiResponse.setResult(userService.getUserById(userId));
        return apiResponse;
    }

    @PutMapping("/users/{userId}")
    public ApiResponse<UserResponse> updateUserById(@PathVariable("userId") String userId,@Valid @RequestBody UserUpdateRequest request){
        ApiResponse<UserResponse> apiResponse = new ApiResponse<>();
        apiResponse.setMessage("Succeeded");
        apiResponse.setResult(userService.updateUserById(userId, request));
        return apiResponse;
    }

    @DeleteMapping("/users/{userId}")
    public ApiResponse<String> deleteUserById(@PathVariable("userId") String userId){
        ApiResponse<String> apiResponse = new ApiResponse<>();
        apiResponse.setMessage("Succeeded");
        apiResponse.setResult("User has been deleted");
        userService.deleteUserId(userId);
        return apiResponse;
    }
}

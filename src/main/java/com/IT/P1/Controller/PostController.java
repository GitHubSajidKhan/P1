package com.IT.P1.Controller;

import com.IT.P1.Entity.Comment;
import com.IT.P1.Entity.Post;
import com.IT.P1.Repository.CommentRepository;
import com.IT.P1.Repository.PostRepository;
import com.IT.P1.Service.CommentService;
import com.IT.P1.Service.PostService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


//    AR Digram ->
//====================


@RestController
@RequestMapping("/api/v1/posts")
public class PostController {

    private PostService postService  ;
    private CommentService commentService ;

    public PostController(PostService postService , CommentService commentService)
    {
        this.commentService = commentService ;
        this.postService = postService ;
    }


//    @PostMapping
//    public String createPost(@RequestBody Post post) {
//        postService.createPost(post);
//        return "saved";
//    }


//    @DeleteMapping
//    public String deletePost(@RequestParam Long id)
//    {
//        postService.deletePost(id);
//        return "deleted Successfully" ;
//    }



//==============================================================================================================================================================================================
//=========================================================================================================================================================================================
//=========================================================================================================================================================================================

//  Code With ResponseEntity
//===========================//


    @PostMapping("/create")
    public ResponseEntity<Post> createPost(@RequestBody Post post)
    {
        Post post1 = postService.createPost(post);
        return new ResponseEntity<>(post1,HttpStatus.CREATED);
    }


    @DeleteMapping
    public ResponseEntity<String> deletePost(@RequestParam long id)
    {
        postService.deletePost(id);
        return new ResponseEntity<>("deleted Successfully" , HttpStatus.CREATED);
    }



























}
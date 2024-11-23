package com.IT.P1.Controller;

import com.IT.P1.Entity.Comment;
import com.IT.P1.Service.CommentService;
import com.IT.P1.Service.PostService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


//    AR Digram ->
//====================



@RestController
@RequestMapping("/api/v1/comments")
public class CommentController {

    private PostService postService;
    private CommentService commentService;

    public CommentController(PostService postService , CommentService commentService)
    {
        this.commentService = commentService ;
        this.postService = postService ;
    }


//    @PostMapping
//    public String createComment(@RequestBody Comment comment, @RequestParam Long postId) {
//        commentService.createComment(comment, postId);
//        return "Comment created successfully";
//    }




//==============================================================================================================================================================================================
//=========================================================================================================================================================================================
//=========================================================================================================================================================================================

//  Code With ResponseEntity
//===========================//


    @PostMapping("/create")
    public ResponseEntity<Comment>createComment(@RequestBody Comment comment , @RequestParam Long postId)
    {
        Comment comment1= commentService.createComment(comment , postId);
        return  new ResponseEntity<>(comment1 , HttpStatus.CREATED);
    }

}
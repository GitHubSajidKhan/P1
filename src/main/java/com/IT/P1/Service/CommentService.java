package com.IT.P1.Service;

import com.IT.P1.Entity.Comment;
import com.IT.P1.Entity.Post;
import com.IT.P1.Repository.CommentRepository;
import com.IT.P1.Repository.PostRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

//    AR Digram ->
//====================


@Service
public class CommentService {

    private PostRepository postRepository ;
    private CommentRepository commentRepository ;


    public CommentService(PostRepository postRepository , CommentRepository commentRepository)
    {
        this.postRepository = postRepository ;
        this.commentRepository = commentRepository ;
    }



//    public void createComment(Comment comment, Long postId) {
//        Post post = postRepository.findById(postId).get();
//        comment.setPost(post);
//        commentRepository.save(comment);
//    }



//==============================================================================================================================================================================================
//=========================================================================================================================================================================================
//=========================================================================================================================================================================================

//  Code With ResponseEntity
//===========================//


    public Comment createComment(Comment comment , Long postId)
    {
        Post post = postRepository.findById(postId).get();
        comment.setPost(post);
        return commentRepository.save(comment);
    }




}
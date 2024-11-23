package com.IT.P1.Service;

import com.IT.P1.Controller.PostController;
import com.IT.P1.Entity.Post;
import com.IT.P1.Repository.CommentRepository;
import com.IT.P1.Repository.PostRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


//    AR Digram ->
//====================



@Service
public class PostService {

    private PostRepository postRepository ;
    private CommentRepository commentRepository ;

    public PostService(PostRepository postRepository , CommentRepository commentRepository)
    {
        this.postRepository = postRepository ;
        this.commentRepository = commentRepository ;
    }


//    public void createPost(Post post)
//    {
//        postRepository.save(post);
//    }


//    public void deletePost(long id)
//    {
//        postRepository.deleteById(id);
//    }




//==============================================================================================================================================================================================
//=========================================================================================================================================================================================
//=========================================================================================================================================================================================

//  Code With ResponseEntity
//===========================//


    public Post createPost(Post post)
    {
        return  postRepository.save(post);
    }

    public void deletePost(long id)
    {
        postRepository.deleteById(id);
    }

}

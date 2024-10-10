/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package work;

import beans.Comment;
import jakarta.servlet.http.HttpServletRequest;

/**
 *
 * @author stag
 */
public class CreateCommentFormChecker extends FormChecker<Comment> {

    public CreateCommentFormChecker(HttpServletRequest request) {
        super(request, new Comment());
    }

    @Override
    public Comment checkForm() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Model.userModel;
import java.util.List;
/**
 *
 * @author HP
 */
public interface userInterface {
    public boolean saveUserHistory(userModel player);
    public boolean deleteUserHistory(userModel player);
    public List<userModel> getAll();
}

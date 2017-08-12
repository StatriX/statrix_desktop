package app.view.administration.users;

import app.model.User;
import app.service.UserService;
import app.service.UserServiceImpl;
import app.view.ModalWindows;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class UsersManageController implements ModalWindows, Initializable {

    private UserService userService = new UserServiceImpl();

    @FXML
    private TableView<User> usersTableList;

    @FXML
    private TableColumn<User, String> userName;

    @FXML
    private TableColumn<User, String> userRole;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        userName.setCellValueFactory(userData -> userData.getValue().nameProperty());
        userRole.setCellValueFactory(roleData -> new SimpleStringProperty(roleData.getValue().isAdministrator() ? "Adnin" : "User" ));

        usersTableList.setItems(userService.getAll());
    }

    @FXML
    public void addEditUser(MouseEvent mouseEvent) {
        onShowModalWindow(mouseEvent, "/administration/users/AddEditUser.fxml", "Регистрация/редактирование пользователя");
    }
}

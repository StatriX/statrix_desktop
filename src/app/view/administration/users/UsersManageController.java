package app.view.administration.users;

import app.view.ModalWindows;
import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;

public class UsersManageController implements ModalWindows {

    @FXML
    public void addEditUser(MouseEvent mouseEvent) {
        onShowModalWindow(mouseEvent, "/administration/users/AddEditUser.fxml", "Регистрация/редактирование пользователя");
    }
}

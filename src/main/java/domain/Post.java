package domain;

import domain.CommentsInfo;
import domain.PictureInfo;

public class Post {
    private int id; //id поста
    private String groupName; //Название группы, где висит пост
    private int ownerId; // id пользователя/группы, кто оставил пост
    private int date; // дата, когда был создан пост
    private String descriptionPost; // Текст в посте (описание)
    private boolean likePost; //Наличие или отсутсвие лайка
    private int countPost; //Количество постов на странице

    private CommentsInfo commentsInfo; // Комменты
    private RepostsInfo repostsInfo; // Репосты
    private PictureInfo pictureInfo; // Прикрепленные картинки к посту

    // + get/set на все поля
}

package domain;

import domain.CommentsInfo;
import domain.PictureInfo;

public class Post {
    private int id; //id поста
    private String groupName; //Название группы, где висит пост
    private int ownerId; // id пользователя/группы, кто оставил пост
    private int date; // дата, когда был создан пост
    private String descriptionPost; // Текст в посте (описание)
    private boolean friendsOnly; // True - запись только для друзей
    private int countPost; //Количество постов на странице
    private boolean canPin; //True - текущий пользователь может закрепить пост
    private boolean canDelete; //True - текущий пользователь может удалить пост
    private boolean  canEdit; //True - текущий пользователь может редактировать пост
    private int pinnedPost;// Пост закреплен


    private LikesInfo likesInfo;  //Наличие или отсутсвие лайка
    private CommentsInfo commentsInfo; // Комменты
    private RepostsInfo repostsInfo; // Репосты
    private PictureInfo pictureInfo; // Прикрепленные картинки к посту
    private Geo geo; // Местоположение откуда сделан пост
    // + get/set на все поля
}

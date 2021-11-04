package domain;

public class CommentsInfo {
    private int id; //id коммента
    private int ownerId; // id пользователя, который оставил коммент
    private String descriptionComment; // Текст комментария
    private boolean likeComment; //Наличие или отсутсвие лайка
    private int countComment; //Количество комментариев

    private PictureInfo pictureInfo; // Прикрепленные картинки к комменту
    private RepostsInfo repostsInfo; // Репосты

    // + get/set на все поля
}

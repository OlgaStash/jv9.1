package domain;

import domain.CommentsInfo;
import domain.PictureInfo;

public class RepostsInfo {
    private int id; //id репоста
    private int ownerId; // id пользователя, ктоторый сделал репост
    private String descriptionRepost; // Текст над репостом (описание)
    private boolean likeRepost; //Наличие или отсутсвие лайка

    private CommentsInfo commentsInfo; // Комменты
    private PictureInfo pictureInfo; // Прикрепленные картинки к посту

    // + get/set на все поля
}

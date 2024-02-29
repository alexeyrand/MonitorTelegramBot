package com.alexeyrand.monitortelegrambot.telegram.inline;

import org.telegram.telegrambots.meta.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.InlineKeyboardButton;

import java.util.ArrayList;
import java.util.List;

public class BlockListInline {

    public static InlineKeyboardMarkup blackListInline() {
        InlineKeyboardMarkup markupInline = new InlineKeyboardMarkup();
        List<List<InlineKeyboardButton>> rowsInline = new ArrayList<>();
        List<InlineKeyboardButton> rowInline1 = new ArrayList<>();
        InlineKeyboardButton inlineKeyboardButton1 = new InlineKeyboardButton();
        inlineKeyboardButton1.setText("Hello");
        inlineKeyboardButton1.setCallbackData("/hello");
        inlineKeyboardButton1.setUrl("");
        rowInline1.add(inlineKeyboardButton1);
        return markupInline;
    }

}

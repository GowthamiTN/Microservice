package com.eazybytes.cards.service;

import com.eazybytes.cards.dto.CardsDto;

public interface ICardsService {
    void createCard(String mobileNumber);
    CardsDto fetchCard(String mobileNumber);
    boolean deleteCard(String mobileNumber);
    boolean updateCard(CardsDto cardsDto);
}

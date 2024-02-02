package ru.yandex.practicum.contacts.presentation.base;

public interface ListDiffInterface <S> {
    public boolean theSameAs(S anotherObject);

    public boolean equals(Object o);
}

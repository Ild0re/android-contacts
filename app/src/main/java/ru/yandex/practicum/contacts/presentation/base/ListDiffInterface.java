package ru.yandex.practicum.contacts.presentation.base;

public interface ListDiffInterface <S> {
    public boolean theSameAs(S obj);

    public boolean equals(Object o);
}

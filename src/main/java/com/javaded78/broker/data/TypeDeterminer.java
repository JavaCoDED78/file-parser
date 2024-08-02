package com.javaded78.broker.data;

import com.javaded78.domain.DataType;

import java.util.Optional;

public interface TypeDeterminer {

    DataType determineType(String value);
}

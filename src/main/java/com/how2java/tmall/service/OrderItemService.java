package com.how2java.tmall.service;

import com.how2java.tmall.pojo.OrderItem;

import java.util.List;

public interface OrderItemService {
void add(OrderItem orderItem);
void delete(int id);
OrderItem get(int id);
List<OrderItem> list();
void update(OrderItem orderItem);

}

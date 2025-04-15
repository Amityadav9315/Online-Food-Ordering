package com.zosh.service;

import com.zosh.model.Cart;
import com.zosh.model.CartItem;
import com.zosh.repository.CartItemRepository;
import com.zosh.repository.CartRepository;
import com.zosh.repository.FoodRepository;
import com.zosh.request.AddCartItemRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CartServiceImpl  implements  CartService{
    @Autowired
    private CartRepository cartRepository;

    @Autowired
    private UserService userService;

    @Autowired
    private CartItemRepository cartItemRepository;

    @Autowired
    private FoodRepository foodRepository;

    @Override
    public CartItem addItemToCart(AddCartItemRequest req, String jwt) throws Exception {
        return null;
    }

    @Override
    public CartItem updateCartItemQuantity(Long cartItemId, int quantity) throws Exception {
        return null;
    }

    @Override
    public Cart removeItemFromCart(Long cartItemId, String jwt) throws Exception {
        return null;
    }

    @Override
    public Long calculateCartTotals(Cart cart) throws Exception {
        return 0L;
    }

    @Override
    public Cart findCartById(Long id) throws Exception {
        return null;
    }

    @Override
    public Cart findCartByUserId(Long userId) throws Exception {
        return null;
    }

    @Override
    public Cart clearCart(Long userId) throws Exception {
        return null;
    }
}

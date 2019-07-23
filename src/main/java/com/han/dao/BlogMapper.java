package com.han.dao;

import com.han.domain.Blog;

public interface BlogMapper {
    public Blog selectBlog(Blog blog);
    public void saveBlog(Blog blog);
    public void updateBlog(Blog blog);
    public void deleteBlog(Blog blog);
}

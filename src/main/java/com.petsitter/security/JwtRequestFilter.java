//package com.petsitter.security;
//
//import com.petsitter.service.UserService;
//import io.jsonwebtoken.Claims;
//import io.jsonwebtoken.ExpiredJwtException;
//import io.jsonwebtoken.SignatureException;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
//import org.springframework.stereotype.Component;
//import org.springframework.web.filter.OncePerRequestFilter;
//
//import javax.servlet.FilterChain;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
//@Component
//public class JwtRequestFilter extends OncePerRequestFilter {
//
//	@Autowired
//	private UserService userService;
//
//	@Autowired
//	private JwtUtil jwtUtil;
//
//	@Override
//	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
//			throws ServletException, IOException {
//
//		final String authorizationHeader = request.getHeader("Authorization");
//
//		String username = null;
//		String jwt = null;
//
//		if (authorizationHeader != null && authorizationHeader.startsWith("Bearer ")) {
//			jwt = authorizationHeader.substring(7);
//
//			try {
//				username = JwtUtil.extractClaim(jwt, Claims::getSubject);
//			} catch (ExpiredJwtException e) {
//				response.sendError(500, "Expired JWT");
//			} catch (SignatureException e) {
//				response.sendError(500, "SignatureException. JWT signature does not match locally computed signature");
//			} catch (Exception e) {
//				response.sendError(500, "Exception. JWT exception " + e.getMessage());
//			}
//		}
//
//		if (username != null && SecurityContextHolder.getContext().getAuthentication() == null) {
//			UserDetails userDetails = userService.loadUserByUsername(username);
//
//			if (jwtUtil.validateToken(jwt, userDetails)) {
//
//				UsernamePasswordAuthenticationToken authentication = jwtUtil.getAuthentication(jwt,
//						SecurityContextHolder.getContext().getAuthentication(), userDetails);
//
//				authentication.setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
//
//				logger.info("authenticated user " + username + ", setting security context");
//				SecurityContextHolder.getContext().setAuthentication(authentication);
//			}
//		}
//		chain.doFilter(request, response);
//	}
//}

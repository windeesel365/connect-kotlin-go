package main

import (
	"net/http"

	"github.com/labstack/echo/v4"
)

func main() {
	e := echo.New()

	e.GET("/greet", func(c echo.Context) error {
		return c.JSON(http.StatusOK, map[string]string{
			"message": "Data message from Go backend",
		})
	})

	e.Start(":8080")
}

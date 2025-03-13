from django import forms
from .import models

class Studentform(forms.ModelForm):
    class Meta:
        model =models.Student
        fields = ["name","email","password"]

        widgets={
            "name":forms.TextInput(
                attrs={"class":"form-control","placeholder":"Enter your name"}
            ),
            "email":forms.EmailInput(
                attrs={"class":"form-control","placeholder":"Enter your email"}
            ),
            "password":forms.PasswordInput(
                attrs={"class":"form-control","placeholder":"Enter your password"}
            ),
        }

import base64


with open("./base64_verify_function/output.png", "wb") as fh:
    fh.write(base64.decodebytes(img_data))
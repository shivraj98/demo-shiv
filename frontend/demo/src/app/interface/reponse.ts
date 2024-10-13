export interface Book {
    id: number;
    title: string;
    authore: string;
    genre: string;
    rating: number;
    price: number;
    createdAt: string;
    updatedAt: string;
}

export interface ResponseData {
    data: Book[];
    message: string;
}